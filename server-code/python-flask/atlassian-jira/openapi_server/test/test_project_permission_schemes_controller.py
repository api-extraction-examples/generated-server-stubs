import unittest

from flask import json

from openapi_server.models.id_bean import IdBean  # noqa: E501
from openapi_server.models.permission_scheme import PermissionScheme  # noqa: E501
from openapi_server.models.project_issue_security_levels import ProjectIssueSecurityLevels  # noqa: E501
from openapi_server.models.security_scheme import SecurityScheme  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectPermissionSchemesController(BaseTestCase):
    """ProjectPermissionSchemesController integration test stubs"""

    def test_assign_permission_scheme(self):
        """Test case for assign_permission_scheme

        Assign permission scheme
        """
        id_bean = {"id":0}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_key_or_id}/permissionscheme'.format(project_key_or_id='project_key_or_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(id_bean),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_assigned_permission_scheme(self):
        """Test case for get_assigned_permission_scheme

        Get assigned permission scheme
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_key_or_id}/permissionscheme'.format(project_key_or_id='project_key_or_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_issue_security_scheme(self):
        """Test case for get_project_issue_security_scheme

        Get project issue security scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_key_or_id}/issuesecuritylevelscheme'.format(project_key_or_id='project_key_or_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_security_levels_for_project(self):
        """Test case for get_security_levels_for_project

        Get project issue security levels
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_key_or_id}/securitylevel'.format(project_key_or_id='project_key_or_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
