import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestCookiesController(BaseTestCase):
    """CookiesController integration test stubs"""

    def test_cookies_delete_get(self):
        """Test case for cookies_delete_get

        Deletes cookie(s) as provided by the query string and redirects to cookie list.
        """
        query_string = [('freeform', {'key': 'freeform_example'})]
        headers = { 
        }
        response = self.client.open(
            '/cookies/delete',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cookies_get(self):
        """Test case for cookies_get

        Returns cookie data.
        """
        headers = { 
        }
        response = self.client.open(
            '/cookies',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cookies_set_get(self):
        """Test case for cookies_set_get

        Sets cookie(s) as provided by the query string and redirects to cookie list.
        """
        query_string = [('freeform', {'key': 'freeform_example'})]
        headers = { 
        }
        response = self.client.open(
            '/cookies/set',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cookies_set_name_value_get(self):
        """Test case for cookies_set_name_value_get

        Sets a cookie and redirects to cookie list.
        """
        headers = { 
        }
        response = self.client.open(
            '/cookies/set/{name}/{value}'.format(name='name_example', value='value_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
