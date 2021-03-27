package by.koldunova.energosbit.act.boot.controller;

import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.koldunova.energosbit.act.boot.entity.Act;
import by.koldunova.energosbit.act.boot.entity.MyFiles;
import by.koldunova.energosbit.act.boot.service.ActService;
import by.koldunova.energosbit.act.boot.service.MyFilesService;

@Controller
public class ViewController {
    @Autowired
    ActService actService;
    @Autowired
    MyFilesService myFilesService;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    @GetMapping("/")
    public String getView(Model model) {
        List<Act> acts = actService.findAllActs();
        model.addAttribute("acts", acts);
        model.addAttribute("filterForm",new Act());

        return "index";
    }

    @GetMapping("/detail")
    public String getDetail(Model model, @RequestParam String id) {
        try {

            int id_int = Integer.parseInt(id);
            Act act = actService.findActById(id_int);

            model.addAttribute("numAct", act.getNumAct());
            model.addAttribute("dateAct", dateFormat.format(act.getDateAct()));
            model.addAttribute("consumer", act.getConsumer());
            model.addAttribute("contract", act.getContract());
            model.addAttribute("department", act.getDepartment());
            model.addAttribute("cost", act.getCost());
            model.addAttribute("status", act.getStatusAct());
            model.addAttribute("files", act.getFiles());

            return "detail";
        } catch (Exception e) {
            return "redirect:/";
        }
    }

    @GetMapping("/download")
    public ResponseEntity<ByteArrayResource> getFile(Model model, @RequestParam String file) {
        int id_int = 0;
        try {
            id_int = Integer.parseInt(file);

            MyFiles file1 = myFilesService.findById(id_int);
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file1.getFileName() + "\"")
                    .body(new ByteArrayResource(file1.getFile()));
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/")
    public String getFiltredPage(@ModelAttribute("filterForm") Act actFilter, Model model) {
        List<Act> acts = actService.findByContract(actFilter.getContract());
        model.addAttribute("acts", acts);
        
        return "index";
    }
}
