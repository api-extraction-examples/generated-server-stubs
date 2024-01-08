import unittest

from flask import json

from openapi_server.models.default_workflow import DefaultWorkflow  # noqa: E501
from openapi_server.models.issue_type_workflow_mapping import IssueTypeWorkflowMapping  # noqa: E501
from openapi_server.models.issue_types_workflow_mapping import IssueTypesWorkflowMapping  # noqa: E501
from openapi_server.models.page_bean_workflow_scheme import PageBeanWorkflowScheme  # noqa: E501
from openapi_server.models.workflow_scheme import WorkflowScheme  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowSchemesController(BaseTestCase):
    """WorkflowSchemesController integration test stubs"""

    def test_create_workflow_scheme(self):
        """Test case for create_workflow_scheme

        Create workflow scheme
        """
        workflow_scheme = {"originalDefaultWorkflow":"originalDefaultWorkflow","description":"description","issueTypes":{"key":{"avatarId":0,"hierarchyLevel":6,"name":"name","description":"description","self":"self","entityId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","iconUrl":"iconUrl","id":"id","subtask":True}},"originalIssueTypeMappings":{"key":"originalIssueTypeMappings"},"defaultWorkflow":"defaultWorkflow","updateDraftIfNeeded":True,"draft":True,"name":"name","self":"https://openapi-generator.tech","id":5,"lastModified":"lastModified","issueTypeMappings":{"key":"issueTypeMappings"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme',
            method='POST',
            headers=headers,
            data=json.dumps(workflow_scheme),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_default_workflow(self):
        """Test case for delete_default_workflow

        Delete default workflow
        """
        query_string = [('updateDraftIfNeeded', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/default'.format(id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_workflow_mapping(self):
        """Test case for delete_workflow_mapping

        Delete issue types for workflow in workflow scheme
        """
        query_string = [('workflowName', 'workflow_name_example'),
                        ('updateDraftIfNeeded', True)]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/workflow'.format(id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_workflow_scheme(self):
        """Test case for delete_workflow_scheme

        Delete workflow scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_workflow_scheme_issue_type(self):
        """Test case for delete_workflow_scheme_issue_type

        Delete workflow for issue type in workflow scheme
        """
        query_string = [('updateDraftIfNeeded', True)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/issuetype/{issue_type}'.format(id=56, issue_type='issue_type_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_workflow_schemes(self):
        """Test case for get_all_workflow_schemes

        Get all workflow schemes
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_default_workflow(self):
        """Test case for get_default_workflow

        Get default workflow
        """
        query_string = [('returnDraftIfExists', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/default'.format(id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow(self):
        """Test case for get_workflow

        Get issue types for workflows in workflow scheme
        """
        query_string = [('workflowName', 'workflow_name_example'),
                        ('returnDraftIfExists', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/workflow'.format(id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow_scheme(self):
        """Test case for get_workflow_scheme

        Get workflow scheme
        """
        query_string = [('returnDraftIfExists', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}'.format(id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow_scheme_issue_type(self):
        """Test case for get_workflow_scheme_issue_type

        Get workflow for issue type in workflow scheme
        """
        query_string = [('returnDraftIfExists', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/issuetype/{issue_type}'.format(id=56, issue_type='issue_type_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_workflow_scheme_issue_type(self):
        """Test case for set_workflow_scheme_issue_type

        Set workflow for issue type in workflow scheme
        """
        issue_type_workflow_mapping = {"issueType":"issueType","updateDraftIfNeeded":True,"workflow":"workflow"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/issuetype/{issue_type}'.format(id=56, issue_type='issue_type_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_workflow_mapping),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_default_workflow(self):
        """Test case for update_default_workflow

        Update default workflow
        """
        default_workflow = {"updateDraftIfNeeded":True,"workflow":"workflow"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/default'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(default_workflow),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_workflow_mapping(self):
        """Test case for update_workflow_mapping

        Set issue types for workflow in workflow scheme
        """
        issue_types_workflow_mapping = {"updateDraftIfNeeded":True,"workflow":"workflow","defaultMapping":True,"issueTypes":["issueTypes","issueTypes"]}
        query_string = [('workflowName', 'workflow_name_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/workflow'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_types_workflow_mapping),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_workflow_scheme(self):
        """Test case for update_workflow_scheme

        Update workflow scheme
        """
        workflow_scheme = {"originalDefaultWorkflow":"originalDefaultWorkflow","description":"description","issueTypes":{"key":{"avatarId":0,"hierarchyLevel":6,"name":"name","description":"description","self":"self","entityId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","iconUrl":"iconUrl","id":"id","subtask":True}},"originalIssueTypeMappings":{"key":"originalIssueTypeMappings"},"defaultWorkflow":"defaultWorkflow","updateDraftIfNeeded":True,"draft":True,"name":"name","self":"https://openapi-generator.tech","id":5,"lastModified":"lastModified","issueTypeMappings":{"key":"issueTypeMappings"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(workflow_scheme),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
