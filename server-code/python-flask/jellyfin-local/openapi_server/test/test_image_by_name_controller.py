import unittest

from flask import json

from openapi_server.models.image_by_name_info import ImageByNameInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestImageByNameController(BaseTestCase):
    """ImageByNameController integration test stubs"""

    def test_get_general_image(self):
        """Test case for get_general_image

        Get General Image.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Images/General/{name}/{type}'.format(name='name_example', type='type_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_general_images(self):
        """Test case for get_general_images

        Get all general images.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Images/General',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_media_info_image(self):
        """Test case for get_media_info_image

        Get media info image.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Images/MediaInfo/{theme}/{name}'.format(theme='theme_example', name='name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_media_info_images(self):
        """Test case for get_media_info_images

        Get all media info images.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Images/MediaInfo',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_rating_image(self):
        """Test case for get_rating_image

        Get rating image.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Images/Ratings/{theme}/{name}'.format(theme='theme_example', name='name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_rating_images(self):
        """Test case for get_rating_images

        Get all general images.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Images/Ratings',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
