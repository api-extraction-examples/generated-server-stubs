import unittest

from flask import json

from openapi_server.models.change_filter_owner import ChangeFilterOwner  # noqa: E501
from openapi_server.models.column_item import ColumnItem  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.filter import Filter  # noqa: E501
from openapi_server.models.page_bean_filter_details import PageBeanFilterDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFiltersController(BaseTestCase):
    """FiltersController integration test stubs"""

    def test_change_filter_owner(self):
        """Test case for change_filter_owner

        Change filter owner
        """
        change_filter_owner = {"accountId":"accountId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/owner'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(change_filter_owner),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_filter(self):
        """Test case for create_filter

        Create filter
        """
        filter = {"jql":"jql","favouritedCount":0,"description":"description","favourite":True,"editPermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}],"name":"name","viewUrl":"https://openapi-generator.tech","self":"https://openapi-generator.tech","searchUrl":"https://openapi-generator.tech","id":"id","sharePermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}]}
        query_string = [('expand', 'expand_example'),
                        ('overrideSharePermissions', False)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter',
            method='POST',
            headers=headers,
            data=json.dumps(filter),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_favourite_for_filter(self):
        """Test case for delete_favourite_for_filter

        Remove filter as favorite
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/favourite'.format(id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_filter(self):
        """Test case for delete_filter

        Delete filter
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_columns(self):
        """Test case for get_columns

        Get columns
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/columns'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_favourite_filters(self):
        """Test case for get_favourite_filters

        Get favorite filters
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/favourite',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_filter(self):
        """Test case for get_filter

        Get filter
        """
        query_string = [('expand', 'expand_example'),
                        ('overrideSharePermissions', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}'.format(id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_filters_paginated(self):
        """Test case for get_filters_paginated

        Search for filters
        """
        query_string = [('filterName', 'filter_name_example'),
                        ('accountId', 'account_id_example'),
                        ('owner', 'owner_example'),
                        ('groupname', 'groupname_example'),
                        ('groupId', 'group_id_example'),
                        ('projectId', 56),
                        ('id', [56]),
                        ('orderBy', 'name'),
                        ('startAt', 0),
                        ('maxResults', 50),
                        ('expand', 'expand_example'),
                        ('overrideSharePermissions', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_my_filters(self):
        """Test case for get_my_filters

        Get my filters
        """
        query_string = [('expand', 'expand_example'),
                        ('includeFavourites', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/my',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reset_columns(self):
        """Test case for reset_columns

        Reset columns
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/columns'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("multipart/form-data not supported by Connexion")
    def test_set_columns(self):
        """Test case for set_columns

        Set columns
        """
        request_body = ['request_body_example']
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'multipart/form-data',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/columns'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(request_body),
            content_type='multipart/form-data')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_favourite_for_filter(self):
        """Test case for set_favourite_for_filter

        Add filter as favorite
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}/favourite'.format(id=56),
            method='PUT',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_filter(self):
        """Test case for update_filter

        Update filter
        """
        filter = {"jql":"jql","favouritedCount":0,"description":"description","favourite":True,"editPermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}],"name":"name","viewUrl":"https://openapi-generator.tech","self":"https://openapi-generator.tech","searchUrl":"https://openapi-generator.tech","id":"id","sharePermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}]}
        query_string = [('expand', 'expand_example'),
                        ('overrideSharePermissions', False)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/filter/{id}'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(filter),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
