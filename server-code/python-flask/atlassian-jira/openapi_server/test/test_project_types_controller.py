import unittest

from flask import json

from openapi_server.models.project_type import ProjectType  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectTypesController(BaseTestCase):
    """ProjectTypesController integration test stubs"""

    def test_get_accessible_project_type_by_key(self):
        """Test case for get_accessible_project_type_by_key

        Get accessible project type by key
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/type/{project_type_key}/accessible'.format(project_type_key='project_type_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_accessible_project_types(self):
        """Test case for get_all_accessible_project_types

        Get licensed project types
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/type/accessible',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_project_types(self):
        """Test case for get_all_project_types

        Get all project types
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/type',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_type_by_key(self):
        """Test case for get_project_type_by_key

        Get project type by key
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/type/{project_type_key}'.format(project_type_key='project_type_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
