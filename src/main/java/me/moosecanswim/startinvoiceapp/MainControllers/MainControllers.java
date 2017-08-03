package me.moosecanswim.startinvoiceapp.MainControllers;

import me.moosecanswim.startinvoiceapp.Models.Product;
import me.moosecanswim.startinvoiceapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainControllers {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping("/")
    public String index(Model model)
    {
        String sendToIndex = "This is my WELCOME page (from controler)";
        model.addAttribute("message", sendToIndex);
        return "index";
    }
    @RequestMapping("/login")
    public String login(Model model)
    {
        String sendToLogin = "This is my login page.  you will do loging in things here (from controler)";
        model.addAttribute("messageInput",sendToLogin);
        return "login";
    }


    @GetMapping("/addproduct")
    public String addProduct(Model model)
    {
        model.addAttribute("product", new Product());
        return "addproduct";
    }

   /* @PostMapping("/addproduct")
    public String addProduct(@ModelAttribute Product product){
        return "addproductconfirm";
    }*/


    @RequestMapping("/showproductdetails")
    public String showItemDetails(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult){
        System.out.println(bindingResult.toString());
        if(bindingResult.hasErrors()) {
            return "addproduct";
        }
        productRepository.save(product);
        return "showproductdetails";
    }

    @RequestMapping("/listproducts")
    public String listProducts(Model model)
    {
        String sendToListProducts = "This is a list of your products (from controller) The dependencies are: Spring-boot-starter-tymeleaf, Spring-boot-starter-web, and Spring-boot-starter-test";
        model.addAttribute("message",sendToListProducts);

        return "listproducts";
    }

    @RequestMapping("/thankyou")
    public @ResponseBody String thankYou()
    {
        return "Thanks for shopping with us!";
    }
}
