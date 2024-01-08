import unittest

from flask import json

from openapi_server.models.apps_response import AppsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.user_invitation_create_request import UserInvitationCreateRequest  # noqa: E501
from openapi_server.models.user_invitation_response import UserInvitationResponse  # noqa: E501
from openapi_server.models.user_invitations_response import UserInvitationsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserInvitationsController(BaseTestCase):
    """UserInvitationsController integration test stubs"""

    def test_user_invitations_create_instance(self):
        """Test case for user_invitations_create_instance

        
        """
        user_invitation_create_request = {"data":{"relationships":{"visibleApps":{"data":[{"id":"id","type":"apps"},{"id":"id","type":"apps"}]}},"attributes":{"firstName":"firstName","lastName":"lastName","roles":[null,null],"allAppsVisible":True,"email":"email","provisioningAllowed":True},"type":"userInvitations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/userInvitations',
            method='POST',
            headers=headers,
            data=json.dumps(user_invitation_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_invitations_delete_instance(self):
        """Test case for user_invitations_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/userInvitations/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_invitations_get_collection(self):
        """Test case for user_invitations_get_collection

        
        """
        query_string = [('filter[email]', ['filter_email_example']),
                        ('filter[roles]', ['filter_roles_example']),
                        ('filter[visibleApps]', ['filter_visible_apps_example']),
                        ('sort', ['sort_example']),
                        ('fields[userInvitations]', ['fields_user_invitations_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[visibleApps]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/userInvitations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_invitations_get_instance(self):
        """Test case for user_invitations_get_instance

        
        """
        query_string = [('fields[userInvitations]', ['fields_user_invitations_example']),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[visibleApps]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/userInvitations/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_user_invitations_visible_apps_get_to_many_related(self):
        """Test case for user_invitations_visible_apps_get_to_many_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/userInvitations/{id}/visibleApps'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
