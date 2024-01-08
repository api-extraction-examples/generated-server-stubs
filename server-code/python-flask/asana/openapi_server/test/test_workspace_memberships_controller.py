import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_workspace_membership200_response import GetWorkspaceMembership200Response  # noqa: E501
from openapi_server.models.get_workspace_memberships_for_user200_response import GetWorkspaceMembershipsForUser200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkspaceMembershipsController(BaseTestCase):
    """WorkspaceMembershipsController integration test stubs"""

    def test_get_workspace_membership(self):
        """Test case for get_workspace_membership

        Get a workspace membership
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspace_memberships/{workspace_membership_gid}'.format(workspace_membership_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workspace_memberships_for_user(self):
        """Test case for get_workspace_memberships_for_user

        Get workspace memberships for a user
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
            '/api/1.0/users/{user_gid}/workspace_memberships'.format(user_gid='me'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workspace_memberships_for_workspace(self):
        """Test case for get_workspace_memberships_for_workspace

        Get the workspace memberships for a workspace
        """
        query_string = [('user', 'me'),
                        ('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/workspace_memberships'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
