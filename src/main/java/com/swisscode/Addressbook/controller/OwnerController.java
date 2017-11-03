package com.swisscode.Addressbook.controller;

import com.swisscode.Addressbook.entity.Owner;
import com.swisscode.Addressbook.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @RequestMapping(value = "/owner", method = RequestMethod.POST)
    public void createOwner(@RequestBody Owner owner) {
        ownerService.createOwner(owner);
    }

    @RequestMapping(value = "/owner/{id}", method = RequestMethod.DELETE)
    public void deleteOwner(@PathVariable Long id)
    {
        ownerService.deleteOwner(id);
    }

    @RequestMapping(value = "/owner/{id}", method = RequestMethod.GET)
    public Owner getOwner(@PathVariable Long id)
    {
        return ownerService.getOwner(id);
    }

    @RequestMapping
    public void updateOwner(@RequestBody Owner owner)
    {
        ownerService.updateOwner(owner);
    }
}
