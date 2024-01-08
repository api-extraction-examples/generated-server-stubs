import unittest

from flask import json

from openapi_server.models.branding_options import BrandingOptions  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBrandingController(BaseTestCase):
    """BrandingController integration test stubs"""

    def test_get_branding_css(self):
        """Test case for get_branding_css

        Gets branding css.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Branding/Css',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_branding_css2(self):
        """Test case for get_branding_css2

        Gets branding css.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Branding/Css.css',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_branding_options(self):
        """Test case for get_branding_options

        Gets branding configuration.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Branding/Configuration',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
