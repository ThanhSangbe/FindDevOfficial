package com.sang.Controller;

import com.sang.pojo.Candidate;
import com.sang.pojo.Job;
import com.sang.pojo.TinTuyenDung;
import com.sang.pojo.Employer;
import com.sang.service.TinTuyenDungService;
import com.sang.services.tinTuyenDungsv;
import com.sang.utils.HibernateUtils;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.eclipse.persistence.platform.database.CloudscapePlatform;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @Autowired
    private TinTuyenDungService tinTuyenDungService; 
    @RequestMapping("/")
    public String index(Model model) {

            model.addAttribute("Tintuyendungs",this.tinTuyenDungService.getTinTuyenDungs());

        return "index";
    }

    @RequestMapping("/search")
    public String search(Model model, @RequestParam(value = "keyword") String keyword) {
        tinTuyenDungsv tin = new tinTuyenDungsv();
        List<TinTuyenDung> list = tin.getResultkeys(keyword);
        if (list.size() == 0) {
            model.addAttribute("message", "No Result");
        } else {
            model.addAttribute("results", list);
        }
        return "results";
    }
    @RequestMapping("/detail")
    public String details( Model model,@RequestParam(name="id", required = true) Integer id)
    {   tinTuyenDungsv tin = new tinTuyenDungsv();
        model.addAttribute("item",tin.getTinTuyenDung(id));
        return "detail";
    }

    

}
