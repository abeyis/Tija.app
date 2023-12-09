Feature: New media should be able to be added, deleted and sorted on media pages.
  Background:
    * login to app
    * Click the "Online Mağaza" module button
    * Click the "Medya" module button

  Scenario:TC0060 Testing redirect to B2BC page
    * verify that it goes to the media Page

  Scenario:TC0061 Testing to search media with searchbox
    * search media with searchbox
    * verify that image is displayed on the page

  Scenario:TC0062 Testing to add media
    * add image
    * verify that the image has been added

  Scenario:TC0063 Testing to delete media
    * delete image
    * verify that the image has been deleted

  Scenario:TC0155 Test to sort media with "Önce en yeni" criterion
    * sort with "Önce en yeni" criterion
    * verify that it is sorted by criterion once en yeni

  Scenario:TC0156 Test to sort media with "Önce en eski" criterion
    * sort with "Önce en eski" criterion
    * verify that it is sorted by criterion once en eski