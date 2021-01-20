package com.johnson.referalLink;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@RestController
public class ReferralController {

    ArrayList<ReferalData> referalList = new ArrayList<>();

    @RequestMapping(value = "referral", method = RequestMethod.GET)
    public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes, @RequestParam(value = "name", defaultValue = "benn8johnson") String name, HttpServletRequest request) {
        referalList.add(new ReferalData(name,request.getRemoteAddr()));

        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
        attributes.addAttribute("attribute", "redirectWithRedirectView");
        return new RedirectView("https://play.google.com/store/apps/details?id=com.frive.android&hl=en_GB&gl=US");
    }

    @GetMapping("/checkReferral")
    public ReferalData getLastReferral() {
        if(referalList.isEmpty()){
            return new ReferalData("","");
        }
        return referalList.get(referalList.size()-1);
    }

}
