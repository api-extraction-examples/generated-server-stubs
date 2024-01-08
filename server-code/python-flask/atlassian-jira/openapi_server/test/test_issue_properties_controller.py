import unittest

from flask import json

from openapi_server.models.bulk_issue_property_update_request import BulkIssuePropertyUpdateRequest  # noqa: E501
from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.issue_entity_properties import IssueEntityProperties  # noqa: E501
from openapi_server.models.issue_filter_for_bulk_property_delete import IssueFilterForBulkPropertyDelete  # noqa: E501
from openapi_server.models.multi_issue_entity_properties import MultiIssueEntityProperties  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssuePropertiesController(BaseTestCase):
    """IssuePropertiesController integration test stubs"""

    def test_bulk_delete_issue_property(self):
        """Test case for bulk_delete_issue_property

        Bulk delete issue property
        """
        issue_filter_for_bulk_property_delete = {"currentValue":"","entityIds":[0,0]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/properties/{property_key}'.format(property_key='property_key_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(issue_filter_for_bulk_property_delete),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bulk_set_issue_properties_by_issue(self):
        """Test case for bulk_set_issue_properties_by_issue

        Bulk set issue properties by issue
        """
        multi_issue_entity_properties = {"issues":[{"issueID":0,"properties":{"key":{"valueAsDouble":9.301444243932576,"numberType":"INT","fieldNames":"{}","decimalValue":1.4658129805029452,"valueAsBoolean":True,"valueNode":True,"long":True,"longValue":2,"valueAsInt":3,"missingNode":True,"number":True,"valueAsText":"valueAsText","array":True,"containerNode":True,"numberValue":7.061401241503109,"bigDecimal":True,"valueAsLong":2,"integralNumber":True,"textValue":"textValue","double":True,"intValue":5,"bigInteger":True,"doubleValue":5.962133916683182,"floatingPointNumber":True,"int":True,"textual":True,"pojo":True,"bigIntegerValue":6,"boolean":True,"null":True,"binary":True,"elements":"{}","booleanValue":True,"fields":"{}","binaryValue":["binaryValue","binaryValue"],"object":True}}},{"issueID":0,"properties":{"key":{"valueAsDouble":9.301444243932576,"numberType":"INT","fieldNames":"{}","decimalValue":1.4658129805029452,"valueAsBoolean":True,"valueNode":True,"long":True,"longValue":2,"valueAsInt":3,"missingNode":True,"number":True,"valueAsText":"valueAsText","array":True,"containerNode":True,"numberValue":7.061401241503109,"bigDecimal":True,"valueAsLong":2,"integralNumber":True,"textValue":"textValue","double":True,"intValue":5,"bigInteger":True,"doubleValue":5.962133916683182,"floatingPointNumber":True,"int":True,"textual":True,"pojo":True,"bigIntegerValue":6,"boolean":True,"null":True,"binary":True,"elements":"{}","booleanValue":True,"fields":"{}","binaryValue":["binaryValue","binaryValue"],"object":True}}}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/properties/multi',
            method='POST',
            headers=headers,
            data=json.dumps(multi_issue_entity_properties),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bulk_set_issue_property(self):
        """Test case for bulk_set_issue_property

        Bulk set issue property
        """
        bulk_issue_property_update_request = {"filter":"","expression":"expression","value":""}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/properties/{property_key}'.format(property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(bulk_issue_property_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_bulk_set_issues_properties_list(self):
        """Test case for bulk_set_issues_properties_list

        Bulk set issues properties by list
        """
        issue_entity_properties = {"entitiesIds":[0,0,0,0,0],"properties":{"key":{"valueAsDouble":9.301444243932576,"numberType":"INT","fieldNames":"{}","decimalValue":1.4658129805029452,"valueAsBoolean":True,"valueNode":True,"long":True,"longValue":2,"valueAsInt":3,"missingNode":True,"number":True,"valueAsText":"valueAsText","array":True,"containerNode":True,"numberValue":7.061401241503109,"bigDecimal":True,"valueAsLong":2,"integralNumber":True,"textValue":"textValue","double":True,"intValue":5,"bigInteger":True,"doubleValue":5.962133916683182,"floatingPointNumber":True,"int":True,"textual":True,"pojo":True,"bigIntegerValue":6,"boolean":True,"null":True,"binary":True,"elements":"{}","booleanValue":True,"fields":"{}","binaryValue":["binaryValue","binaryValue"],"object":True}}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/properties',
            method='POST',
            headers=headers,
            data=json.dumps(issue_entity_properties),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_issue_property(self):
        """Test case for delete_issue_property

        Delete issue property
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/properties/{property_key}'.format(issue_id_or_key='issue_id_or_key_example', property_key='property_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_property(self):
        """Test case for get_issue_property

        Get issue property
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/properties/{property_key}'.format(issue_id_or_key='issue_id_or_key_example', property_key='property_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_property_keys(self):
        """Test case for get_issue_property_keys

        Get issue property keys
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/properties'.format(issue_id_or_key='issue_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_issue_property(self):
        """Test case for set_issue_property

        Set issue property
        """
        body = None
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/issue/{issue_id_or_key}/properties/{property_key}'.format(issue_id_or_key='issue_id_or_key_example', property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
