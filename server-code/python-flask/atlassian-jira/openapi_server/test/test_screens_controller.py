import unittest

from flask import json

from openapi_server.models.page_bean_screen import PageBeanScreen  # noqa: E501
from openapi_server.models.page_bean_screen_with_tab import PageBeanScreenWithTab  # noqa: E501
from openapi_server.models.screen import Screen  # noqa: E501
from openapi_server.models.screen_details import ScreenDetails  # noqa: E501
from openapi_server.models.screenable_field import ScreenableField  # noqa: E501
from openapi_server.models.update_screen_details import UpdateScreenDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestScreensController(BaseTestCase):
    """ScreensController integration test stubs"""

    def test_add_field_to_default_screen(self):
        """Test case for add_field_to_default_screen

        Add field to default screen
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/addToDefault/{field_id}'.format(field_id='field_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_screen(self):
        """Test case for create_screen

        Create screen
        """
        screen_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens',
            method='POST',
            headers=headers,
            data=json.dumps(screen_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_screen(self):
        """Test case for delete_screen

        Delete screen
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}'.format(screen_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_available_screen_fields(self):
        """Test case for get_available_screen_fields

        Get available screen fields
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/availableFields'.format(screen_id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_screens(self):
        """Test case for get_screens

        Get screens
        """
        query_string = [('startAt', 0),
                        ('maxResults', 100),
                        ('id', [56]),
                        ('queryString', ''),
                        ('scope', ['scope_example']),
                        ('orderBy', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_screens_for_field(self):
        """Test case for get_screens_for_field

        Get screens for a field
        """
        query_string = [('startAt', 0),
                        ('maxResults', 100),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/screens'.format(field_id='field_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_screen(self):
        """Test case for update_screen

        Update screen
        """
        update_screen_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}'.format(screen_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_screen_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
