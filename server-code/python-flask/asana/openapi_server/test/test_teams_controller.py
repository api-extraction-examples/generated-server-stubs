import unittest

from flask import json

from openapi_server.models.add_user_for_team_request import AddUserForTeamRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_team_membership200_response import GetTeamMembership200Response  # noqa: E501
from openapi_server.models.get_teams_for_user200_response import GetTeamsForUser200Response  # noqa: E501
from openapi_server.models.remove_user_for_team_request import RemoveUserForTeamRequest  # noqa: E501
from openapi_server.models.update_team200_response import UpdateTeam200Response  # noqa: E501
from openapi_server.models.update_team_request import UpdateTeamRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTeamsController(BaseTestCase):
    """TeamsController integration test stubs"""

    def test_add_user_for_team(self):
        """Test case for add_user_for_team

        Add a user to a team
        """
        add_user_for_team_request = openapi_server.AddUserForTeamRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/teams/{team_gid}/addUser'.format(team_gid='159874'),
            method='POST',
            headers=headers,
            data=json.dumps(add_user_for_team_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_team(self):
        """Test case for create_team

        Create a team
        """
        update_team_request = openapi_server.UpdateTeamRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/teams',
            method='POST',
            headers=headers,
            data=json.dumps(update_team_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_team(self):
        """Test case for get_team

        Get a team
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
            '/api/1.0/teams/{team_gid}'.format(team_gid='159874'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_teams_for_user(self):
        """Test case for get_teams_for_user

        Get teams for a user
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('organization', '1331')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/users/{user_gid}/teams'.format(user_gid='me'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_teams_for_workspace(self):
        """Test case for get_teams_for_workspace

        Get teams in a workspace
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
            '/api/1.0/workspaces/{workspace_gid}/teams'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_user_for_team(self):
        """Test case for remove_user_for_team

        Remove a user from a team
        """
        remove_user_for_team_request = openapi_server.RemoveUserForTeamRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/teams/{team_gid}/removeUser'.format(team_gid='159874'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_user_for_team_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_team(self):
        """Test case for update_team

        Update a team
        """
        update_team_request = openapi_server.UpdateTeamRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/teams',
            method='PUT',
            headers=headers,
            data=json.dumps(update_team_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
