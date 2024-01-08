import unittest

from flask import json

from openapi_server.models.default_workflow import DefaultWorkflow  # noqa: E501
from openapi_server.models.issue_type_workflow_mapping import IssueTypeWorkflowMapping  # noqa: E501
from openapi_server.models.issue_types_workflow_mapping import IssueTypesWorkflowMapping  # noqa: E501
from openapi_server.models.publish_draft_workflow_scheme import PublishDraftWorkflowScheme  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.workflow_scheme import WorkflowScheme  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowSchemeDraftsController(BaseTestCase):
    """WorkflowSchemeDraftsController integration test stubs"""

    def test_create_workflow_scheme_draft_from_parent(self):
        """Test case for create_workflow_scheme_draft_from_parent

        Create draft workflow scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/createdraft'.format(id=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_draft_default_workflow(self):
        """Test case for delete_draft_default_workflow

        Delete draft default workflow
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/default'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_draft_workflow_mapping(self):
        """Test case for delete_draft_workflow_mapping

        Delete issue types for workflow in draft workflow scheme
        """
        query_string = [('workflowName', 'workflow_name_example')]
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/workflow'.format(id=56),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_workflow_scheme_draft(self):
        """Test case for delete_workflow_scheme_draft

        Delete draft workflow scheme
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_workflow_scheme_draft_issue_type(self):
        """Test case for delete_workflow_scheme_draft_issue_type

        Delete workflow for issue type in draft workflow scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/issuetype/{issue_type}'.format(id=56, issue_type='issue_type_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_draft_default_workflow(self):
        """Test case for get_draft_default_workflow

        Get draft default workflow
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/default'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_draft_workflow(self):
        """Test case for get_draft_workflow

        Get issue types for workflows in draft workflow scheme
        """
        query_string = [('workflowName', 'workflow_name_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/workflow'.format(id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow_scheme_draft(self):
        """Test case for get_workflow_scheme_draft

        Get draft workflow scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow_scheme_draft_issue_type(self):
        """Test case for get_workflow_scheme_draft_issue_type

        Get workflow for issue type in draft workflow scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/issuetype/{issue_type}'.format(id=56, issue_type='issue_type_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_publish_draft_workflow_scheme(self):
        """Test case for publish_draft_workflow_scheme

        Publish draft workflow scheme
        """
        publish_draft_workflow_scheme = {"statusMappings":[{"issueTypeId":"issueTypeId","statusId":"statusId","newStatusId":"newStatusId"},{"issueTypeId":"issueTypeId","statusId":"statusId","newStatusId":"newStatusId"}]}
        query_string = [('validateOnly', False)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/publish'.format(id=56),
            method='POST',
            headers=headers,
            data=json.dumps(publish_draft_workflow_scheme),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_workflow_scheme_draft_issue_type(self):
        """Test case for set_workflow_scheme_draft_issue_type

        Set workflow for issue type in draft workflow scheme
        """
        issue_type_workflow_mapping = {"issueType":"issueType","updateDraftIfNeeded":True,"workflow":"workflow"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/issuetype/{issue_type}'.format(id=56, issue_type='issue_type_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_workflow_mapping),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_draft_default_workflow(self):
        """Test case for update_draft_default_workflow

        Update draft default workflow
        """
        default_workflow = {"updateDraftIfNeeded":True,"workflow":"workflow"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft/default'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(default_workflow),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_draft_workflow_mapping(self):
        """Test case for update_draft_workflow_mapping

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
            '/rest/api/3/workflowscheme/{id}/draft/workflow'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_types_workflow_mapping),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_workflow_scheme_draft(self):
        """Test case for update_workflow_scheme_draft

        Update draft workflow scheme
        """
        workflow_scheme = {"originalDefaultWorkflow":"originalDefaultWorkflow","description":"description","issueTypes":{"key":{"avatarId":0,"hierarchyLevel":6,"name":"name","description":"description","self":"self","entityId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","iconUrl":"iconUrl","id":"id","subtask":True}},"originalIssueTypeMappings":{"key":"originalIssueTypeMappings"},"defaultWorkflow":"defaultWorkflow","updateDraftIfNeeded":True,"draft":True,"name":"name","self":"https://openapi-generator.tech","id":5,"lastModified":"lastModified","issueTypeMappings":{"key":"issueTypeMappings"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/{id}/draft'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(workflow_scheme),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
