import unittest

from flask import json

from openapi_server.models.comment import Comment  # noqa: E501
from openapi_server.models.issue_comment_list_request_bean import IssueCommentListRequestBean  # noqa: E501
from openapi_server.models.page_bean_comment import PageBeanComment  # noqa: E501
from openapi_server.models.page_of_comments import PageOfComments  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueCommentsController(BaseTestCase):
    """IssueCommentsController integration test stubs"""

    def test_add_comment(self):
        """Test case for add_comment

        Add comment
        """
        comment = {"renderedBody":"renderedBody","visibility":"","created":"2000-01-23T04:56:07.000+00:00","self":"self","jsdPublic":True,"id":"id","body":"","jsdAuthorCanSeeRequest":True,"updated":"2000-01-23T04:56:07.000+00:00","properties":[{"value":"","key":"key"},{"value":"","key":"key"}]}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/comment'.format(issue_id_or_key='issue_id_or_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(comment),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_comment(self):
        """Test case for delete_comment

        Delete comment
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/comment/{id}'.format(issue_id_or_key='issue_id_or_key_example', id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_comment(self):
        """Test case for get_comment

        Get comment
        """
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/comment/{id}'.format(issue_id_or_key='issue_id_or_key_example', id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_comments(self):
        """Test case for get_comments

        Get comments
        """
        query_string = [('startAt', 0),
                        ('maxResults', 5000),
                        ('orderBy', 'order_by_example'),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/comment'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_comments_by_ids(self):
        """Test case for get_comments_by_ids

        Get comments by IDs
        """
        issue_comment_list_request_bean = {"ids":[0,0]}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/comment/list',
            method='POST',
            headers=headers,
            data=json.dumps(issue_comment_list_request_bean),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_comment(self):
        """Test case for update_comment

        Update comment
        """
        comment = {"renderedBody":"renderedBody","visibility":"","created":"2000-01-23T04:56:07.000+00:00","self":"self","jsdPublic":True,"id":"id","body":"","jsdAuthorCanSeeRequest":True,"updated":"2000-01-23T04:56:07.000+00:00","properties":[{"value":"","key":"key"},{"value":"","key":"key"}]}
        query_string = [('notifyUsers', True),
                        ('overrideEditableFlag', False),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/comment/{id}'.format(issue_id_or_key='issue_id_or_key_example', id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(comment),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
