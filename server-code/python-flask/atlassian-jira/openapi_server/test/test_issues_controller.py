import unittest

from flask import json

from openapi_server.models.created_issue import CreatedIssue  # noqa: E501
from openapi_server.models.created_issues import CreatedIssues  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.issue_bean import IssueBean  # noqa: E501
from openapi_server.models.issue_changelog_ids import IssueChangelogIds  # noqa: E501
from openapi_server.models.issue_create_metadata import IssueCreateMetadata  # noqa: E501
from openapi_server.models.issue_event import IssueEvent  # noqa: E501
from openapi_server.models.issue_update_details import IssueUpdateDetails  # noqa: E501
from openapi_server.models.issue_update_metadata import IssueUpdateMetadata  # noqa: E501
from openapi_server.models.issues_update_bean import IssuesUpdateBean  # noqa: E501
from openapi_server.models.notification import Notification  # noqa: E501
from openapi_server.models.page_bean_changelog import PageBeanChangelog  # noqa: E501
from openapi_server.models.page_of_changelogs import PageOfChangelogs  # noqa: E501
from openapi_server.models.transitions import Transitions  # noqa: E501
from openapi_server.models.user import User  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssuesController(BaseTestCase):
    """IssuesController integration test stubs"""

    def test_assign_issue(self):
        """Test case for assign_issue

        Assign issue
        """
        user = {"displayName":"displayName","accountType":"atlassian","active":True,"timeZone":"timeZone","locale":"locale","accountId":"accountId","emailAddress":"emailAddress","expand":"expand","name":"name","self":"https://openapi-generator.tech","key":"key"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/assignee'.format(issue_id_or_key='issue_id_or_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(user),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_issue(self):
        """Test case for create_issue

        Create issue
        """
        issue_update_details = {"historyMetadata":"","update":{"key":[{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"},{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"}]},"fields":{"key":""},"properties":[{"value":"","key":"key"},{"value":"","key":"key"}],"transition":""}
        query_string = [('updateHistory', False)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue',
            method='POST',
            headers=headers,
            data=json.dumps(issue_update_details),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_issues(self):
        """Test case for create_issues

        Bulk create issue
        """
        issues_update_bean = {"issueUpdates":[{"historyMetadata":"","update":{"key":[{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"},{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"}]},"fields":{"key":""},"properties":[{"value":"","key":"key"},{"value":"","key":"key"}],"transition":""},{"historyMetadata":"","update":{"key":[{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"},{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"}]},"fields":{"key":""},"properties":[{"value":"","key":"key"},{"value":"","key":"key"}],"transition":""}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/bulk',
            method='POST',
            headers=headers,
            data=json.dumps(issues_update_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_issue(self):
        """Test case for delete_issue

        Delete issue
        """
        query_string = [('deleteSubtasks', 'false')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}'.format(issue_id_or_key='issue_id_or_key_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_do_transition(self):
        """Test case for do_transition

        Transition issue
        """
        issue_update_details = {"historyMetadata":"","update":{"key":[{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"},{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"}]},"fields":{"key":""},"properties":[{"value":"","key":"key"},{"value":"","key":"key"}],"transition":""}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/transitions'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(issue_update_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_edit_issue(self):
        """Test case for edit_issue

        Edit issue
        """
        issue_update_details = {"historyMetadata":"","update":{"key":[{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"},{"add":"triaged","set":"A new summary","edit":{"originalEstimate":"1w 1d","remainingEstimate":"4d"},"copy":{"issuelinks":{"sourceIssues":[{"key":"FP-5"}]}},"remove":"blocker"}]},"fields":{"key":""},"properties":[{"value":"","key":"key"},{"value":"","key":"key"}],"transition":""}
        query_string = [('notifyUsers', True),
                        ('overrideScreenSecurity', False),
                        ('overrideEditableFlag', False)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}'.format(issue_id_or_key='issue_id_or_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_update_details),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_change_logs(self):
        """Test case for get_change_logs

        Get changelogs
        """
        query_string = [('startAt', 0),
                        ('maxResults', 100)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/changelog'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_change_logs_by_ids(self):
        """Test case for get_change_logs_by_ids

        Get changelogs by IDs
        """
        issue_changelog_ids = {"changelogIds":[0,0]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/changelog/list'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(issue_changelog_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_create_issue_meta(self):
        """Test case for get_create_issue_meta

        Get create issue metadata
        """
        query_string = [('projectIds', ['project_ids_example']),
                        ('projectKeys', ['project_keys_example']),
                        ('issuetypeIds', ['issuetype_ids_example']),
                        ('issuetypeNames', ['issuetype_names_example']),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/createmeta',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_edit_issue_meta(self):
        """Test case for get_edit_issue_meta

        Get edit issue metadata
        """
        query_string = [('overrideScreenSecurity', False),
                        ('overrideEditableFlag', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/editmeta'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_events(self):
        """Test case for get_events

        Get events
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/events',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue(self):
        """Test case for get_issue

        Get issue
        """
        query_string = [('fields', ['fields_example']),
                        ('fieldsByKeys', False),
                        ('expand', 'expand_example'),
                        ('properties', ['properties_example']),
                        ('updateHistory', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_transitions(self):
        """Test case for get_transitions

        Get transitions
        """
        query_string = [('expand', 'expand_example'),
                        ('transitionId', 'transition_id_example'),
                        ('skipRemoteOnlyCondition', False),
                        ('includeUnavailableTransitions', False),
                        ('sortByOpsBarAndStatus', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/transitions'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_notify(self):
        """Test case for notify

        Send notification for issue
        """
        notification = {"htmlBody":"htmlBody","subject":"subject","textBody":"textBody","to":"","restrict":""}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/notify'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(notification),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
