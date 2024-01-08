import unittest

from flask import json

from openapi_server.models.project_category import ProjectCategory  # noqa: E501
from openapi_server.models.updated_project_category import UpdatedProjectCategory  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectCategoriesController(BaseTestCase):
    """ProjectCategoriesController integration test stubs"""

    def test_create_project_category(self):
        """Test case for create_project_category

        Create project category
        """
        project_category = {"name":"name","description":"description","self":"https://openapi-generator.tech","id":"id"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectCategory',
            method='POST',
            headers=headers,
            data=json.dumps(project_category),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_project_categories(self):
        """Test case for get_all_project_categories

        Get all project categories
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectCategory',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_category_by_id(self):
        """Test case for get_project_category_by_id

        Get project category by ID
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectCategory/{id}'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_project_category(self):
        """Test case for remove_project_category

        Delete project category
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectCategory/{id}'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_project_category(self):
        """Test case for update_project_category

        Update project category
        """
        project_category = {"name":"name","description":"description","self":"https://openapi-generator.tech","id":"id"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/projectCategory/{id}'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(project_category),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
