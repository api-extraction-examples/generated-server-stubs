import unittest

from flask import json

from openapi_server.models.available_dashboard_gadgets_response import AvailableDashboardGadgetsResponse  # noqa: E501
from openapi_server.models.dashboard import Dashboard  # noqa: E501
from openapi_server.models.dashboard_details import DashboardDetails  # noqa: E501
from openapi_server.models.dashboard_gadget import DashboardGadget  # noqa: E501
from openapi_server.models.dashboard_gadget_response import DashboardGadgetResponse  # noqa: E501
from openapi_server.models.dashboard_gadget_settings import DashboardGadgetSettings  # noqa: E501
from openapi_server.models.dashboard_gadget_update_request import DashboardGadgetUpdateRequest  # noqa: E501
from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_dashboard import PageBeanDashboard  # noqa: E501
from openapi_server.models.page_of_dashboards import PageOfDashboards  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDashboardsController(BaseTestCase):
    """DashboardsController integration test stubs"""

    def test_add_gadget(self):
        """Test case for add_gadget

        Add gadget to dashboard
        """
        dashboard_gadget_settings = {"color":"color","ignoreUriAndModuleKeyValidation":True,"position":"","title":"title","uri":"uri","moduleKey":"moduleKey"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/gadget'.format(dashboard_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(dashboard_gadget_settings),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_copy_dashboard(self):
        """Test case for copy_dashboard

        Copy dashboard
        """
        dashboard_details = {"editPermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}],"name":"name","description":"description","sharePermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{id}/copy'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(dashboard_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_dashboard(self):
        """Test case for create_dashboard

        Create dashboard
        """
        dashboard_details = {"editPermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}],"name":"name","description":"description","sharePermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard',
            method='POST',
            headers=headers,
            data=json.dumps(dashboard_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dashboard(self):
        """Test case for delete_dashboard

        Delete dashboard
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dashboard_item_property(self):
        """Test case for delete_dashboard_item_property

        Delete dashboard item property
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/items/{item_id}/properties/{property_key}'.format(dashboard_id='dashboard_id_example', item_id='item_id_example', property_key='property_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_available_dashboard_gadgets(self):
        """Test case for get_all_available_dashboard_gadgets

        Get available gadgets
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/gadgets',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_dashboards(self):
        """Test case for get_all_dashboards

        Get all dashboards
        """
        query_string = [('filter', 'filter_example'),
                        ('startAt', 0),
                        ('maxResults', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_gadgets(self):
        """Test case for get_all_gadgets

        Get gadgets
        """
        query_string = [('moduleKey', ['module_key_example']),
                        ('uri', ['uri_example']),
                        ('gadgetId', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/gadget'.format(dashboard_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dashboard(self):
        """Test case for get_dashboard

        Get dashboard
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dashboard_item_property(self):
        """Test case for get_dashboard_item_property

        Get dashboard item property
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/items/{item_id}/properties/{property_key}'.format(dashboard_id='dashboard_id_example', item_id='item_id_example', property_key='property_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dashboard_item_property_keys(self):
        """Test case for get_dashboard_item_property_keys

        Get dashboard item property keys
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/items/{item_id}/properties'.format(dashboard_id='dashboard_id_example', item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dashboards_paginated(self):
        """Test case for get_dashboards_paginated

        Search for dashboards
        """
        query_string = [('dashboardName', 'dashboard_name_example'),
                        ('accountId', 'account_id_example'),
                        ('owner', 'owner_example'),
                        ('groupname', 'groupname_example'),
                        ('groupId', 'group_id_example'),
                        ('projectId', 56),
                        ('orderBy', 'name'),
                        ('startAt', 0),
                        ('maxResults', 50),
                        ('status', 'active'),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_gadget(self):
        """Test case for remove_gadget

        Remove gadget from dashboard
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/gadget/{gadget_id}'.format(dashboard_id=56, gadget_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_dashboard_item_property(self):
        """Test case for set_dashboard_item_property

        Set dashboard item property
        """
        body = {"number":5,"string":"string-value"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/items/{item_id}/properties/{property_key}'.format(dashboard_id='dashboard_id_example', item_id='item_id_example', property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_dashboard(self):
        """Test case for update_dashboard

        Update dashboard
        """
        dashboard_details = {"editPermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}],"name":"name","description":"description","sharePermissions":[{"role":"","project":"","id":6,"type":"user","user":"","group":""},{"role":"","project":"","id":6,"type":"user","user":"","group":""}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(dashboard_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_gadget(self):
        """Test case for update_gadget

        Update gadget on dashboard
        """
        dashboard_gadget_update_request = {"color":"color","position":"","title":"title"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/dashboard/{dashboard_id}/gadget/{gadget_id}'.format(dashboard_id=56, gadget_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(dashboard_gadget_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
