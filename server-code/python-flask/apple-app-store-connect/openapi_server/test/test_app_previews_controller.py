import unittest

from flask import json

from openapi_server.models.app_preview_create_request import AppPreviewCreateRequest  # noqa: E501
from openapi_server.models.app_preview_response import AppPreviewResponse  # noqa: E501
from openapi_server.models.app_preview_update_request import AppPreviewUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppPreviewsController(BaseTestCase):
    """AppPreviewsController integration test stubs"""

    def test_app_previews_create_instance(self):
        """Test case for app_previews_create_instance

        
        """
        app_preview_create_request = {"data":{"relationships":{"appPreviewSet":{"data":{"id":"id","type":"appPreviewSets"}}},"attributes":{"fileName":"fileName","fileSize":0,"mimeType":"mimeType","previewFrameTimeCode":"previewFrameTimeCode"},"type":"appPreviews"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviews',
            method='POST',
            headers=headers,
            data=json.dumps(app_preview_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_previews_delete_instance(self):
        """Test case for app_previews_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviews/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_previews_get_instance(self):
        """Test case for app_previews_get_instance

        
        """
        query_string = [('fields[appPreviews]', ['fields_app_previews_example']),
                        ('include', ['include_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviews/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_previews_update_instance(self):
        """Test case for app_previews_update_instance

        
        """
        app_preview_update_request = {"data":{"attributes":{"uploaded":True,"previewFrameTimeCode":"previewFrameTimeCode","sourceFileChecksum":"sourceFileChecksum"},"id":"id","type":"appPreviews"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appPreviews/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(app_preview_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
