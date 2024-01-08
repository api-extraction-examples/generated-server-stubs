import unittest

from flask import json

from openapi_server.models.jira_status import JiraStatus  # noqa: E501
from openapi_server.models.page_of_statuses import PageOfStatuses  # noqa: E501
from openapi_server.models.status_create_request import StatusCreateRequest  # noqa: E501
from openapi_server.models.status_update_request import StatusUpdateRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestStatusController(BaseTestCase):
    """StatusController integration test stubs"""

    def test_create_statuses(self):
        """Test case for create_statuses

        Bulk create statuses
        """
        status_create_request = {"scope":{"project":{"id":"id"},"type":"PROJECT"},"statuses":[{"name":"name","description":"description","statusCategory":"TODO"},{"name":"name","description":"description","statusCategory":"TODO"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/statuses',
            method='POST',
            headers=headers,
            data=json.dumps(status_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_statuses_by_id(self):
        """Test case for delete_statuses_by_id

        Bulk delete Statuses
        """
        query_string = [('id', ['id_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/statuses',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_statuses_by_id(self):
        """Test case for get_statuses_by_id

        Bulk get statuses
        """
        query_string = [('expand', 'expand_example'),
                        ('id', ['id_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/statuses',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search(self):
        """Test case for search

        Search statuses paginated
        """
        query_string = [('expand', 'expand_example'),
                        ('projectId', 'project_id_example'),
                        ('startAt', 0),
                        ('maxResults', 200),
                        ('searchString', 'search_string_example'),
                        ('statusCategory', 'status_category_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/statuses/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_statuses(self):
        """Test case for update_statuses

        Bulk update statuses
        """
        status_update_request = {"statuses":[{"name":"name","description":"description","id":"id","statusCategory":"TODO"},{"name":"name","description":"description","id":"id","statusCategory":"TODO"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/statuses',
            method='PUT',
            headers=headers,
            data=json.dumps(status_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
