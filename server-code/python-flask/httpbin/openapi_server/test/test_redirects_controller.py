import unittest

from flask import json

from openapi_server.models.redirect_to_put_request import RedirectToPutRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRedirectsController(BaseTestCase):
    """RedirectsController integration test stubs"""

    def test_absolute_redirect_nget(self):
        """Test case for absolute_redirect_nget

        Absolutely 302 Redirects n times.
        """
        headers = { 
        }
        response = self.client.open(
            '/absolute-redirect/{n}'.format(n=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_redirect_nget(self):
        """Test case for redirect_nget

        302 Redirects n times.
        """
        headers = { 
        }
        response = self.client.open(
            '/redirect/{n}'.format(n=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_redirect_to_delete(self):
        """Test case for redirect_to_delete

        302/3XX Redirects to the given URL.
        """
        headers = { 
        }
        response = self.client.open(
            '/redirect-to',
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_redirect_to_get(self):
        """Test case for redirect_to_get

        302/3XX Redirects to the given URL.
        """
        query_string = [('url', 'url_example'),
                        ('status_code', 56)]
        headers = { 
        }
        response = self.client.open(
            '/redirect-to',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_redirect_to_patch(self):
        """Test case for redirect_to_patch

        302/3XX Redirects to the given URL.
        """
        headers = { 
        }
        response = self.client.open(
            '/redirect-to',
            method='PATCH',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_redirect_to_post(self):
        """Test case for redirect_to_post

        302/3XX Redirects to the given URL.
        """
        redirect_to_put_request = openapi_server.RedirectToPutRequest()
        headers = { 
            'Content-Type': 'application/x-www-form-urlencoded',
        }
        response = self.client.open(
            '/redirect-to',
            method='POST',
            headers=headers,
            data=json.dumps(redirect_to_put_request),
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/x-www-form-urlencoded not supported by Connexion")
    def test_redirect_to_put(self):
        """Test case for redirect_to_put

        302/3XX Redirects to the given URL.
        """
        redirect_to_put_request = openapi_server.RedirectToPutRequest()
        headers = { 
            'Content-Type': 'application/x-www-form-urlencoded',
        }
        response = self.client.open(
            '/redirect-to',
            method='PUT',
            headers=headers,
            data=json.dumps(redirect_to_put_request),
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_redirect_to_trace(self):
        """Test case for redirect_to_trace

        302/3XX Redirects to the given URL.
        """
        headers = { 
        }
        response = self.client.open(
            '/redirect-to',
            method='TRACE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_relative_redirect_nget(self):
        """Test case for relative_redirect_nget

        Relatively 302 Redirects n times.
        """
        headers = { 
        }
        response = self.client.open(
            '/relative-redirect/{n}'.format(n=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
