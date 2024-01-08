import unittest

from flask import json

from openapi_server.models.add_user_for_workspace200_response import AddUserForWorkspace200Response  # noqa: E501
from openapi_server.models.add_user_for_workspace_request import AddUserForWorkspaceRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_workspace200_response import GetWorkspace200Response  # noqa: E501
from openapi_server.models.get_workspaces200_response import GetWorkspaces200Response  # noqa: E501
from openapi_server.models.remove_user_for_workspace_request import RemoveUserForWorkspaceRequest  # noqa: E501
from openapi_server.models.update_workspace_request import UpdateWorkspaceRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkspacesController(BaseTestCase):
    """WorkspacesController integration test stubs"""

    def test_add_user_for_workspace(self):
        """Test case for add_user_for_workspace

        Add a user to a workspace or organization
        """
        add_user_for_workspace_request = openapi_server.AddUserForWorkspaceRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/addUser'.format(workspace_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(add_user_for_workspace_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workspace(self):
        """Test case for get_workspace

        Get a workspace
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workspaces(self):
        """Test case for get_workspaces

        Get multiple workspaces
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_user_for_workspace(self):
        """Test case for remove_user_for_workspace

        Remove a user from a workspace or organization
        """
        remove_user_for_workspace_request = openapi_server.RemoveUserForWorkspaceRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/removeUser'.format(workspace_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_user_for_workspace_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_workspace(self):
        """Test case for update_workspace

        Update a workspace
        """
        update_workspace_request = openapi_server.UpdateWorkspaceRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}'.format(workspace_gid='12345'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_workspace_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
