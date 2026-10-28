package com.example.Email.email_writer.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {
    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailrequest){
        String response = emailGeneratorService.generateEmail(emailrequest);
        return ResponseEntity.created(response);
    }
}
