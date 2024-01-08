import unittest

from flask import json

from openapi_server.models.create_update_role_request_bean import CreateUpdateRoleRequestBean  # noqa: E501
from openapi_server.models.project_role import ProjectRole  # noqa: E501
from openapi_server.models.project_role_details import ProjectRoleDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectRolesController(BaseTestCase):
    """ProjectRolesController integration test stubs"""

    def test_create_project_role(self):
        """Test case for create_project_role

        Create project role
        """
        create_update_role_request_bean = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role',
            method='POST',
            headers=headers,
            data=json.dumps(create_update_role_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_project_role(self):
        """Test case for delete_project_role

        Delete project role
        """
        query_string = [('swap', 56)]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role/{id}'.format(id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_fully_update_project_role(self):
        """Test case for fully_update_project_role

        Fully update project role
        """
        create_update_role_request_bean = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role/{id}'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(create_update_role_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_project_roles(self):
        """Test case for get_all_project_roles

        Get all project roles
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_role(self):
        """Test case for get_project_role

        Get project role for project
        """
        query_string = [('excludeInactiveUsers', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/role/{id}'.format(project_id_or_key='project_id_or_key_example', id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_role_by_id(self):
        """Test case for get_project_role_by_id

        Get project role by ID
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role/{id}'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_role_details(self):
        """Test case for get_project_role_details

        Get project role details
        """
        query_string = [('currentMember', False),
                        ('excludeConnectAddons', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/roledetails'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_roles(self):
        """Test case for get_project_roles

        Get project roles for project
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/role'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_partial_update_project_role(self):
        """Test case for partial_update_project_role

        Partial update project role
        """
        create_update_role_request_bean = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/role/{id}'.format(id=56),
            method='POST',
            headers=headers,
            data=json.dumps(create_update_role_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
