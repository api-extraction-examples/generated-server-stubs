import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.site import Site  # noqa: E501
from openapi_server.models.site_setup import SiteSetup  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSiteController(BaseTestCase):
    """SiteController integration test stubs"""

    def test_create_site(self):
        """Test case for create_site

        
        """
        site = openapi_server.SiteSetup()
        query_string = [('configure_dns', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites',
            method='POST',
            headers=headers,
            data=json.dumps(site),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_site_in_team(self):
        """Test case for create_site_in_team

        
        """
        site = openapi_server.SiteSetup()
        query_string = [('configure_dns', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_slug}/sites'.format(account_slug='account_slug_example'),
            method='POST',
            headers=headers,
            data=json.dumps(site),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_site(self):
        """Test case for delete_site

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}'.format(site_id='site_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_site(self):
        """Test case for get_site

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_sites(self):
        """Test case for list_sites

        
        """
        query_string = [('name', 'name_example'),
                        ('filter', 'filter_example'),
                        ('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_sites_for_account(self):
        """Test case for list_sites_for_account

        
        """
        query_string = [('name', 'name_example'),
                        ('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/{account_slug}/sites'.format(account_slug='account_slug_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_unlink_site_repo(self):
        """Test case for unlink_site_repo

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/unlink_repo'.format(site_id='site_id_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_site(self):
        """Test case for update_site

        
        """
        site = openapi_server.SiteSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}'.format(site_id='site_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(site),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
