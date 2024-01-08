import unittest

from flask import json

from openapi_server.models.apps_response import AppsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.user_response import UserResponse  # noqa: E501
from openapi_server.models.user_update_request import UserUpdateRequest  # noqa: E501
from openapi_server.models.user_visible_apps_linkages_request import UserVisibleAppsLinkagesRequest  # noqa: E501
from openapi_server.models.user_visible_apps_linkages_response import UserVisibleAppsLinkagesResponse  # noqa: E501
from openapi_server.models.users_response import UsersResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUsersController(BaseTestCase):
    """UsersController integration test stubs"""

    def test_users_delete_instance(self):
        """Test case for users_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_get_collection(self):
        """Test case for users_get_collection

        
        """
        query_string = [('filter[roles]', ['filter_roles_example']),
                        ('filter[username]', ['filter_username_example']),
                        ('filter[visibleApps]', ['filter_visible_apps_example']),
                        ('sort', ['sort_example']),
                        ('fields[users]', ['fields_users_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[visibleApps]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_get_instance(self):
        """Test case for users_get_instance

        
        """
        query_string = [('fields[users]', ['fields_users_example']),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[visibleApps]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_update_instance(self):
        """Test case for users_update_instance

        
        """
        user_update_request = {"data":{"relationships":{"visibleApps":{"data":[{"id":"id","type":"apps"},{"id":"id","type":"apps"}]}},"attributes":{"roles":[null,null],"allAppsVisible":True,"provisioningAllowed":True},"id":"id","type":"users"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(user_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_visible_apps_create_to_many_relationship(self):
        """Test case for users_visible_apps_create_to_many_relationship

        
        """
        user_visible_apps_linkages_request = {"data":[{"id":"id","type":"apps"},{"id":"id","type":"apps"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}/relationships/visibleApps'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(user_visible_apps_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_visible_apps_delete_to_many_relationship(self):
        """Test case for users_visible_apps_delete_to_many_relationship

        
        """
        user_visible_apps_linkages_request = {"data":[{"id":"id","type":"apps"},{"id":"id","type":"apps"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}/relationships/visibleApps'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(user_visible_apps_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_visible_apps_get_to_many_related(self):
        """Test case for users_visible_apps_get_to_many_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}/visibleApps'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_visible_apps_get_to_many_relationship(self):
        """Test case for users_visible_apps_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}/relationships/visibleApps'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_users_visible_apps_replace_to_many_relationship(self):
        """Test case for users_visible_apps_replace_to_many_relationship

        
        """
        user_visible_apps_linkages_request = {"data":[{"id":"id","type":"apps"},{"id":"id","type":"apps"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/users/{id}/relationships/visibleApps'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(user_visible_apps_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
