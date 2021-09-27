package com.JavaPostgres.GalleryController;

@RestController()
public class GalleryController{

    @Autowired
    private Image image

    @GetMapping("/gallery")
    public List<Image> getAllImages(){
        return image.findAll();
    }

    @GetMapping("/gallery/{id}")
    public ResponseEntity<Image> getImageById( @PathVariable(value ="id") Long imageId)
    throws ResourceNotFoundException {
        Image image = ImageRepository.findById(imageId)
          .orElseThrow(() -> new ResourceNotFoundException("Image not found for this id :: " + imageId));
        return ResponseEntity.ok().body(image);
    }

    @PostMapping("/gallery")
    public Image createNewImage(@Valid @RequestBody Image image) {
        return imageRepository.save(image);
    }

    @PutMapping("/gallery/{id}")
    public ResponseEntity<Image> updateImage(@PathVariable(value = "id") Long ImageId,
         @Valid @RequestBody Image ImageDetails) throws ResourceNotFoundException {
        Image image = imageRepository.findById(imageId)
        .orElseThrow(() -> new ResourceNotFoundException("Image not found for this id :: " + imageId));

        image.setId(imageDetails.getId());
        image.setName(imageDetails.getName());
        image.setSeason(imageDetails.getSeason());
        image.setType(imageDetails.getType());
        image.setPrice(imageDetails.getPrice());
        final Image updatedImage = imageRepository.save(image);
        return ResponseEntity.ok(updatedImage);
    }

    @DeleteMapping("/gallery/{id}")
    public Map<String, Boolean> deleteImag(@PathVariable(value = "id") Long imageId)
         throws ResourceNotFoundException {
        Image image = imageRepository.findById(imageId)
       .orElseThrow(() -> new ResourceNotFoundException("Image not found for this id :: " + imageId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}