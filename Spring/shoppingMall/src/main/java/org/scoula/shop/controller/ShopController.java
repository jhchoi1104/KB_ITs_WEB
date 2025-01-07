package org.scoula.shop.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.shop.dto.ShopDTO;
import org.scoula.shop.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {
    final private ShopService service;

    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("list", service.getList());
    }

    @GetMapping({"/get", "/update"})
    public void get(@RequestParam("no") long no, Model model) {
        model.addAttribute("item", service.get(no));
    }

    @GetMapping("/create")
    public void create() {
    }

    @PostMapping("/create")
    public String create(ShopDTO shop) {
        service.create(shop);
        return "redirect:/shop/list";
    }

    @PostMapping("/update")
    public String update(ShopDTO shop) {
        service.update(shop);
        return "redirect:/shop";
    }

    @PostMapping("/delete")
    public String delete(Long no){
        service.delete(no);

        return "redirect:/shop";
    }
}
