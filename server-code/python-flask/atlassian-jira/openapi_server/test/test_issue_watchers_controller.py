import unittest

from flask import json

from openapi_server.models.bulk_issue_is_watching import BulkIssueIsWatching  # noqa: E501
from openapi_server.models.issue_list import IssueList  # noqa: E501
from openapi_server.models.watchers import Watchers  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueWatchersController(BaseTestCase):
    """IssueWatchersController integration test stubs"""

    def test_add_watcher(self):
        """Test case for add_watcher

        Add watcher
        """
        body = 'body_example'
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/watchers'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_is_watching_issue_bulk(self):
        """Test case for get_is_watching_issue_bulk

        Get is watching issue bulk
        """
        issue_list = {"issueIds":["issueIds","issueIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/watching',
            method='POST',
            headers=headers,
            data=json.dumps(issue_list),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_watchers(self):
        """Test case for get_issue_watchers

        Get issue watchers
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/watchers'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_watcher(self):
        """Test case for remove_watcher

        Delete watcher
        """
        query_string = [('username', 'username_example'),
                        ('accountId', '5b10ac8d82e05b22cc7d4ef5')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/watchers'.format(issue_id_or_key='issue_id_or_key_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
