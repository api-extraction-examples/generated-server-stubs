import unittest

from flask import json

from openapi_server.models.app_store_version_submission_create_request import AppStoreVersionSubmissionCreateRequest  # noqa: E501
from openapi_server.models.app_store_version_submission_response import AppStoreVersionSubmissionResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppStoreVersionSubmissionsController(BaseTestCase):
    """AppStoreVersionSubmissionsController integration test stubs"""

    def test_app_store_version_submissions_create_instance(self):
        """Test case for app_store_version_submissions_create_instance

        
        """
        app_store_version_submission_create_request = {"data":{"relationships":{"appStoreVersion":{"data":{"id":"id","type":"appStoreVersions"}}},"type":"appStoreVersionSubmissions"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionSubmissions',
            method='POST',
            headers=headers,
            data=json.dumps(app_store_version_submission_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_store_version_submissions_delete_instance(self):
        """Test case for app_store_version_submissions_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appStoreVersionSubmissions/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
