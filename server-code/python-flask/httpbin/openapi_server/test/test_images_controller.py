import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestImagesController(BaseTestCase):
    """ImagesController integration test stubs"""

    def test_image_get(self):
        """Test case for image_get

        Returns a simple image of the type suggest by the Accept header.
        """
        headers = { 
        }
        response = self.client.open(
            '/image',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_image_jpeg_get(self):
        """Test case for image_jpeg_get

        Returns a simple JPEG image.
        """
        headers = { 
        }
        response = self.client.open(
            '/image/jpeg',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_image_png_get(self):
        """Test case for image_png_get

        Returns a simple PNG image.
        """
        headers = { 
        }
        response = self.client.open(
            '/image/png',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_image_svg_get(self):
        """Test case for image_svg_get

        Returns a simple SVG image.
        """
        headers = { 
        }
        response = self.client.open(
            '/image/svg',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_image_webp_get(self):
        """Test case for image_webp_get

        Returns a simple WEBP image.
        """
        headers = { 
        }
        response = self.client.open(
            '/image/webp',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
