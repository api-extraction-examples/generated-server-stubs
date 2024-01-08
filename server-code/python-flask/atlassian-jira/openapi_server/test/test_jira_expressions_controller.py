import unittest

from flask import json

from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.jira_expression_eval_request_bean import JiraExpressionEvalRequestBean  # noqa: E501
from openapi_server.models.jira_expression_for_analysis import JiraExpressionForAnalysis  # noqa: E501
from openapi_server.models.jira_expression_result import JiraExpressionResult  # noqa: E501
from openapi_server.models.jira_expressions_analysis import JiraExpressionsAnalysis  # noqa: E501
from openapi_server.test import BaseTestCase


class TestJiraExpressionsController(BaseTestCase):
    """JiraExpressionsController integration test stubs"""

    def test_analyse_expression(self):
        """Test case for analyse_expression

        Analyse Jira expression
        """
        jira_expression_for_analysis = {"contextVariables":{"key":"contextVariables"},"expressions":"issues.map(issue => issue.properties['property_key'])"}
        query_string = [('check', 'syntax')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/expression/analyse',
            method='POST',
            headers=headers,
            data=json.dumps(jira_expression_for_analysis),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_evaluate_jira_expression(self):
        """Test case for evaluate_jira_expression

        Evaluate Jira expression
        """
        jira_expression_eval_request_bean = {"expression":"{ key: issue.key, type: issue.issueType.name, links: issue.links.map(link => link.linkedIssue.id) }","context":""}
        query_string = [('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/expression/eval',
            method='POST',
            headers=headers,
            data=json.dumps(jira_expression_eval_request_bean),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
