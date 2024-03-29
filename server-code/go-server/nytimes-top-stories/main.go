/*
 * Top Stories
 *
 * The Top Stories API provides lists of articles and associated images by section.
 *
 * API version: 2.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"log"
	"net/http"

	openapi "github.com/GIT_USER_ID/GIT_REPO_ID/go"
)

func main() {
	log.Printf("Server started")

	StoriesAPIService := openapi.NewStoriesAPIService()
	StoriesAPIController := openapi.NewStoriesAPIController(StoriesAPIService)

	router := openapi.NewRouter(StoriesAPIController)

	log.Fatal(http.ListenAndServe(":8080", router))
}
