package me.moosecanswim.startinvoiceapp.MainControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainControllers {

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


    @RequestMapping("/addproduct")
    public String addProduct(Model model)
    {
        String sendToaProduct = "Add a Product here.  (from controller)";
        model.addAttribute("messageAddProduct", sendToaProduct);
        return "addProduct";
    }
    @RequestMapping("/listproducts")
    public String listProducts(Model model)
    {
        String sendToListProducts = "This is a list of your products (from controller)";
        model.addAttribute("messageListProduct",sendToListProducts);
        return "listProducts";
    }
    @RequestMapping("/thankyou")
    public @ResponseBody String thankYou()
    {
        return "Thanks for shopping with us!";
    }
}
