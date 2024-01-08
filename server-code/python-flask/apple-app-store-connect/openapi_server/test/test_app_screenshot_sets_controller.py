import unittest

from flask import json

from openapi_server.models.app_screenshot_set_app_screenshots_linkages_request import AppScreenshotSetAppScreenshotsLinkagesRequest  # noqa: E501
from openapi_server.models.app_screenshot_set_app_screenshots_linkages_response import AppScreenshotSetAppScreenshotsLinkagesResponse  # noqa: E501
from openapi_server.models.app_screenshot_set_create_request import AppScreenshotSetCreateRequest  # noqa: E501
from openapi_server.models.app_screenshot_set_response import AppScreenshotSetResponse  # noqa: E501
from openapi_server.models.app_screenshots_response import AppScreenshotsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppScreenshotSetsController(BaseTestCase):
    """AppScreenshotSetsController integration test stubs"""

    def test_app_screenshot_sets_app_screenshots_get_to_many_related(self):
        """Test case for app_screenshot_sets_app_screenshots_get_to_many_related

        
        """
        query_string = [('fields[appScreenshotSets]', ['fields_app_screenshot_sets_example']),
                        ('fields[appScreenshots]', ['fields_app_screenshots_example']),
                        ('limit', 56),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshotSets/{id}/appScreenshots'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshot_sets_app_screenshots_get_to_many_relationship(self):
        """Test case for app_screenshot_sets_app_screenshots_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshotSets/{id}/relationships/appScreenshots'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshot_sets_app_screenshots_replace_to_many_relationship(self):
        """Test case for app_screenshot_sets_app_screenshots_replace_to_many_relationship

        
        """
        app_screenshot_set_app_screenshots_linkages_request = {"data":[{"id":"id","type":"appScreenshots"},{"id":"id","type":"appScreenshots"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshotSets/{id}/relationships/appScreenshots'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_screenshot_set_app_screenshots_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshot_sets_create_instance(self):
        """Test case for app_screenshot_sets_create_instance

        
        """
        app_screenshot_set_create_request = {"data":{"relationships":{"appStoreVersionLocalization":{"data":{"id":"id","type":"appStoreVersionLocalizations"}}},"attributes":{},"type":"appScreenshotSets"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshotSets',
            method='POST',
            headers=headers,
            data=json.dumps(app_screenshot_set_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshot_sets_delete_instance(self):
        """Test case for app_screenshot_sets_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshotSets/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_screenshot_sets_get_instance(self):
        """Test case for app_screenshot_sets_get_instance

        
        """
        query_string = [('fields[appScreenshotSets]', ['fields_app_screenshot_sets_example']),
                        ('include', ['include_example']),
                        ('fields[appScreenshots]', ['fields_app_screenshots_example']),
                        ('limit[appScreenshots]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appScreenshotSets/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
