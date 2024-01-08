import unittest

from flask import json

from openapi_server.models.image_provider_info import ImageProviderInfo  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.remote_image_result import RemoteImageResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRemoteImageController(BaseTestCase):
    """RemoteImageController integration test stubs"""

    def test_download_remote_image(self):
        """Test case for download_remote_image

        Downloads a remote image for an item.
        """
        query_string = [('type', openapi_server.ImageType()),
                        ('imageUrl', 'image_url_example')]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/RemoteImages/Download'.format(item_id='item_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remote_image(self):
        """Test case for get_remote_image

        Gets a remote image.
        """
        query_string = [('imageUrl', 'image_url_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Images/Remote',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remote_image_providers(self):
        """Test case for get_remote_image_providers

        Gets available remote image providers for an item.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/RemoteImages/Providers'.format(item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_remote_images(self):
        """Test case for get_remote_images

        Gets available remote images for an item.
        """
        query_string = [('type', openapi_server.ImageType()),
                        ('startIndex', 56),
                        ('limit', 56),
                        ('providerName', 'provider_name_example'),
                        ('includeAllLanguages', False)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{item_id}/RemoteImages'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
