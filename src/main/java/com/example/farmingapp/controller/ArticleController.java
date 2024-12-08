package com.example.farmingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ArticleController {

    @GetMapping("/articles")
    public List<Map<String, String>> getArticles() {
        // List of famous farming articles
        return List.of(
            Map.of("title", "Sustainable Farming", "url", "https://www.sustainablefarming.org"),
            Map.of("title", "Crop Rotation Benefits", "url", "https://www.croprotationbenefits.com"),
            Map.of("title", "Organic Farming Tips", "url", "https://www.organicfarmingtips.com"),
            Map.of("title", "Advances in Agricultural Technology", "url", "https://www.agritechnews.com"),
            Map.of("title", "Water Conservation in Farming", "url", "https://www.waterconservationfarming.com")
        );
    }
}
