import unittest

from flask import json

from openapi_server.models.votes import Votes  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueVotesController(BaseTestCase):
    """IssueVotesController integration test stubs"""

    def test_add_vote(self):
        """Test case for add_vote

        Add vote
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/votes'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_votes(self):
        """Test case for get_votes

        Get votes
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/votes'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_vote(self):
        """Test case for remove_vote

        Delete vote
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/votes'.format(issue_id_or_key='issue_id_or_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
