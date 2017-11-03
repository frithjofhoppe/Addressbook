package com.swisscode.Addressbook.controller;

import com.swisscode.Addressbook.entity.Adressbook;
import com.swisscode.Addressbook.service.AdressbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdressbookController
{
    @Autowired
    AdressbookService adressbookService;

    @RequestMapping(value = "/owner/{id}/book", method = RequestMethod.POST)
    public void createAdressbook(@RequestBody Adressbook adressbook,@PathVariable Long id)
    {
        adressbookService.createAdressbook(adressbook,id);
    }

    @RequestMapping(value = "/owner/{owner}/book/{book}", method  = RequestMethod.DELETE)
    public void deleteAdressbook(@PathVariable Long owner, @PathVariable String book)
    {
        adressbookService.deleteAdressbook(owner,book);
    }

    @RequestMapping(value = "/owner/{owner}/book/{book}", method = RequestMethod.GET)
    public List<Adressbook> getAdressbook(@PathVariable Long owner, @PathVariable String book)
    {
        return adressbookService.getAddressbook(owner,book);
    }

    @RequestMapping(value = "/owner/{owner}/book/{book}", method = RequestMethod.PUT)
    public void updateAdressbook(@RequestBody Adressbook adressbook, @PathVariable Long id, @PathVariable String book)
    {
        adressbookService.updateAdressbook(adressbook, id, book);
    }
}
