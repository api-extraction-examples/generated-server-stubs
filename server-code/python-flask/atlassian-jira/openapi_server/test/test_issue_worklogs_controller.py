import unittest

from flask import json

from openapi_server.models.changed_worklogs import ChangedWorklogs  # noqa: E501
from openapi_server.models.page_of_worklogs import PageOfWorklogs  # noqa: E501
from openapi_server.models.worklog import Worklog  # noqa: E501
from openapi_server.models.worklog_ids_request_bean import WorklogIdsRequestBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueWorklogsController(BaseTestCase):
    """IssueWorklogsController integration test stubs"""

    def test_add_worklog(self):
        """Test case for add_worklog

        Add worklog
        """
        worklog = {"issueId":"issueId","visibility":"","timeSpent":"timeSpent","created":"2000-01-23T04:56:07.000+00:00","started":"2000-01-23T04:56:07.000+00:00","timeSpentSeconds":5,"self":"https://openapi-generator.tech","comment":"","id":"id","updated":"2000-01-23T04:56:07.000+00:00","properties":[{"value":"","key":"key"},{"value":"","key":"key"}]}
        query_string = [('notifyUsers', True),
                        ('adjustEstimate', 'auto'),
                        ('newEstimate', 'new_estimate_example'),
                        ('reduceBy', 'reduce_by_example'),
                        ('expand', ''),
                        ('overrideEditableFlag', False)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(worklog),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_worklog(self):
        """Test case for delete_worklog

        Delete worklog
        """
        query_string = [('notifyUsers', True),
                        ('adjustEstimate', 'auto'),
                        ('newEstimate', 'new_estimate_example'),
                        ('increaseBy', 'increase_by_example'),
                        ('overrideEditableFlag', False)]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog/{id}'.format(issue_id_or_key='issue_id_or_key_example', id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ids_of_worklogs_deleted_since(self):
        """Test case for get_ids_of_worklogs_deleted_since

        Get IDs of deleted worklogs
        """
        query_string = [('since', 0)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/worklog/deleted',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ids_of_worklogs_modified_since(self):
        """Test case for get_ids_of_worklogs_modified_since

        Get IDs of updated worklogs
        """
        query_string = [('since', 0),
                        ('expand', '')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/worklog/updated',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_worklog(self):
        """Test case for get_issue_worklog

        Get issue worklogs
        """
        query_string = [('startAt', 0),
                        ('maxResults', 5000),
                        ('startedAfter', 56),
                        ('startedBefore', 56),
                        ('expand', '')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_worklog(self):
        """Test case for get_worklog

        Get worklog
        """
        query_string = [('expand', '')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog/{id}'.format(issue_id_or_key='issue_id_or_key_example', id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_worklogs_for_ids(self):
        """Test case for get_worklogs_for_ids

        Get worklogs
        """
        worklog_ids_request_bean = {"ids":[0,0]}
        query_string = [('expand', '')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/worklog/list',
            method='POST',
            headers=headers,
            data=json.dumps(worklog_ids_request_bean),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_worklog(self):
        """Test case for update_worklog

        Update worklog
        """
        worklog = {"issueId":"issueId","visibility":"","timeSpent":"timeSpent","created":"2000-01-23T04:56:07.000+00:00","started":"2000-01-23T04:56:07.000+00:00","timeSpentSeconds":5,"self":"https://openapi-generator.tech","comment":"","id":"id","updated":"2000-01-23T04:56:07.000+00:00","properties":[{"value":"","key":"key"},{"value":"","key":"key"}]}
        query_string = [('notifyUsers', True),
                        ('adjustEstimate', 'auto'),
                        ('newEstimate', 'new_estimate_example'),
                        ('expand', ''),
                        ('overrideEditableFlag', False)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/worklog/{id}'.format(issue_id_or_key='issue_id_or_key_example', id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(worklog),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
