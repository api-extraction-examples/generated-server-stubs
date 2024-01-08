import unittest

from flask import json

from openapi_server.models.issue_matches import IssueMatches  # noqa: E501
from openapi_server.models.issue_picker_suggestions import IssuePickerSuggestions  # noqa: E501
from openapi_server.models.issues_and_jql_queries import IssuesAndJQLQueries  # noqa: E501
from openapi_server.models.search_request_bean import SearchRequestBean  # noqa: E501
from openapi_server.models.search_results import SearchResults  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueSearchController(BaseTestCase):
    """IssueSearchController integration test stubs"""

    def test_get_issue_picker_resource(self):
        """Test case for get_issue_picker_resource

        Get issue picker suggestions
        """
        query_string = [('query', 'query'),
                        ('currentJQL', 'current_jql_example'),
                        ('currentIssueKey', 'current_issue_key_example'),
                        ('currentProjectId', 'current_project_id_example'),
                        ('showSubTasks', True),
                        ('showSubTaskParent', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/picker',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_match_issues(self):
        """Test case for match_issues

        Check issues against JQL
        """
        issues_and_jql_queries = {"issueIds":[0,0],"jqls":["jqls","jqls"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/match',
            method='POST',
            headers=headers,
            data=json.dumps(issues_and_jql_queries),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_for_issues_using_jql(self):
        """Test case for search_for_issues_using_jql

        Search for issues using JQL (GET)
        """
        query_string = [('jql', 'project = HSP'),
                        ('startAt', 0),
                        ('maxResults', 50),
                        ('validateQuery', 'strict'),
                        ('fields', ['fields_example']),
                        ('expand', 'expand_example'),
                        ('properties', ['properties_example']),
                        ('fieldsByKeys', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_for_issues_using_jql_post(self):
        """Test case for search_for_issues_using_jql_post

        Search for issues using JQL (POST)
        """
        search_request_bean = {"expand":["expand","expand"],"jql":"jql","maxResults":0,"validateQuery":"strict","fieldsByKeys":True,"fields":["fields","fields"],"properties":["properties","properties"],"startAt":6}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/search',
            method='POST',
            headers=headers,
            data=json.dumps(search_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
