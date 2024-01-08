import unittest

from flask import json

from openapi_server.models.member import Member  # noqa: E501
from openapi_server.models.members import Members  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_members_request_inner import PostMembersRequestInner  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTeamMembersController(BaseTestCase):
    """TeamMembersController integration test stubs"""

    def test_delete_member(self):
        """Test case for delete_member

        Delete a team member by ID.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/members/{member_id}'.format(member_id='member_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_me(self):
        """Test case for get_me

        Get the current team member associated with the token
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/members/me',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_member(self):
        """Test case for get_member

        Get a single team member by ID.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/members/{member_id}'.format(member_id='member_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_members(self):
        """Test case for get_members

        Returns a list of all members in the account.
        """
        query_string = [('limit', 3.4),
                        ('offset', 3.4),
                        ('filter', 'filter_example'),
                        ('sort', 'sort_example')]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/members',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_member(self):
        """Test case for patch_member

        Modify a team member by ID.
        """
        patch_delta = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/members/{member_id}'.format(member_id='member_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_delta),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_members(self):
        """Test case for post_members

        Invite new members.
        """
        members_body = [openapi_server.PostMembersRequestInner()]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/members',
            method='POST',
            headers=headers,
            data=json.dumps(members_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
