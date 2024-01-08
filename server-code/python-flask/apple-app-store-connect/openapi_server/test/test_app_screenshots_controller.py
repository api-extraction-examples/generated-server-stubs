import unittest

from flask import json

from openapi_server.models.app_screenshot_create_request import AppScreenshotCreateRequest  # noqa: E501
from openapi_server.models.app_screenshot_response import AppScreenshotResponse  # noqa: E501
from openapi_server.models.app_screenshot_update_request import AppScreenshotUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppScreenshotsController(BaseTestCase):
    """AppScreenshotsController integration test stubs"""

    def test_app_screenshots_create_instance(self):
        """Test case for app_screenshots_create_instance

        
        """
        app_screenshot_create_request = {"data":{"relationships":{"appScreenshotSet":{"data":{"id":"id","type":"appScreenshotSets"}}},"attributes":{"fileName":"fileName","fileSize":0},"type":"appScreenshots"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshots',
            method='POST',
            headers=headers,
            data=json.dumps(app_screenshot_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshots_delete_instance(self):
        """Test case for app_screenshots_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshots/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshots_get_instance(self):
        """Test case for app_screenshots_get_instance

        
        """
        query_string = [('fields[appScreenshots]', ['fields_app_screenshots_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshots/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshots_update_instance(self):
        """Test case for app_screenshots_update_instance

        
        """
        app_screenshot_update_request = {"data":{"attributes":{"uploaded":True,"sourceFileChecksum":"sourceFileChecksum"},"id":"id","type":"appScreenshots"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshots/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_screenshot_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
