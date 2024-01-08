import unittest

from flask import json

from openapi_server.models.api_v1_apps_post200_response import ApiV1AppsPost200Response  # noqa: E501
from openapi_server.models.api_v1_apps_post_request import ApiV1AppsPostRequest  # noqa: E501
from openapi_server.models.application import Application  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppsController(BaseTestCase):
    """AppsController integration test stubs"""

    @unittest.skip("application/form-data not supported by Connexion")
    def test_api_v1_apps_post(self):
        """Test case for api_v1_apps_post

        
        """
        api_v1_apps_post_request = openapi_server.ApiV1AppsPostRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/form-data',
        }
        response = self.client.open(
            '/api/v1/apps',
            method='POST',
            headers=headers,
            data=json.dumps(api_v1_apps_post_request),
            content_type='application/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_api_v1_apps_verify_credentials_get(self):
        """Test case for api_v1_apps_verify_credentials_get

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/apps/verify_credentials',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
