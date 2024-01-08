import unittest

from flask import json

from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectKeyAndNameValidationController(BaseTestCase):
    """ProjectKeyAndNameValidationController integration test stubs"""

    def test_get_valid_project_key(self):
        """Test case for get_valid_project_key

        Get valid project key
        """
        query_string = [('key', 'HSP')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectvalidate/validProjectKey',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_valid_project_name(self):
        """Test case for get_valid_project_name

        Get valid project name
        """
        query_string = [('name', 'name_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectvalidate/validProjectName',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_validate_project_key(self):
        """Test case for validate_project_key

        Validate project key
        """
        query_string = [('key', 'HSP')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectvalidate/key',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
