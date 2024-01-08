import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_custom_field_setting_for_portfolio200_response import AddCustomFieldSettingForPortfolio200Response  # noqa: E501
from openapi_server.models.add_custom_field_setting_for_portfolio_request import AddCustomFieldSettingForPortfolioRequest  # noqa: E501
from openapi_server.models.add_item_for_portfolio_request import AddItemForPortfolioRequest  # noqa: E501
from openapi_server.models.add_members_for_portfolio_request import AddMembersForPortfolioRequest  # noqa: E501
from openapi_server.models.create_portfolio201_response import CreatePortfolio201Response  # noqa: E501
from openapi_server.models.create_portfolio_request import CreatePortfolioRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_items_for_portfolio200_response import GetItemsForPortfolio200Response  # noqa: E501
from openapi_server.models.get_portfolios200_response import GetPortfolios200Response  # noqa: E501
from openapi_server.models.remove_custom_field_setting_for_portfolio_request import RemoveCustomFieldSettingForPortfolioRequest  # noqa: E501
from openapi_server.models.remove_item_for_portfolio_request import RemoveItemForPortfolioRequest  # noqa: E501
from openapi_server.models.remove_members_for_portfolio_request import RemoveMembersForPortfolioRequest  # noqa: E501
from openapi_server import util


def add_custom_field_setting_for_portfolio(portfolio_gid, add_custom_field_setting_for_portfolio_request, opt_pretty=None):  # noqa: E501
    """Add a custom field to a portfolio

    Custom fields are associated with portfolios by way of custom field settings.  This method creates a setting for the portfolio. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param add_custom_field_setting_for_portfolio_request: Information about the custom field setting.
    :type add_custom_field_setting_for_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool

    :rtype: Union[AddCustomFieldSettingForPortfolio200Response, Tuple[AddCustomFieldSettingForPortfolio200Response, int], Tuple[AddCustomFieldSettingForPortfolio200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_custom_field_setting_for_portfolio_request = AddCustomFieldSettingForPortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_item_for_portfolio(portfolio_gid, add_item_for_portfolio_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Add a portfolio item

    Add an item to a portfolio. Returns an empty data block. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param add_item_for_portfolio_request: Information about the item being inserted.
    :type add_item_for_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_item_for_portfolio_request = AddItemForPortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_members_for_portfolio(portfolio_gid, add_members_for_portfolio_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Add users to a portfolio

    Adds the specified list of users as members of the portfolio. Returns the updated portfolio record. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param add_members_for_portfolio_request: Information about the members being added.
    :type add_members_for_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreatePortfolio201Response, Tuple[CreatePortfolio201Response, int], Tuple[CreatePortfolio201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_members_for_portfolio_request = AddMembersForPortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_portfolio(create_portfolio_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Create a portfolio

    Creates a new portfolio in the given workspace with the supplied name.  Note that portfolios created in the Asana UI may have some state (like the “Priority” custom field) which is automatically added to the portfolio when it is created. Portfolios created via our API will *not* be created with the same initial state to allow integrations to create their own starting state on a portfolio. # noqa: E501

    :param create_portfolio_request: The portfolio to create.
    :type create_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreatePortfolio201Response, Tuple[CreatePortfolio201Response, int], Tuple[CreatePortfolio201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_portfolio_request = CreatePortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_portfolio(portfolio_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a portfolio

    An existing portfolio can be deleted by making a DELETE request on the URL for that portfolio.  Returns an empty data record. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_items_for_portfolio(portfolio_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get portfolio items

    Get a list of the items in compact form in a portfolio. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetItemsForPortfolio200Response, Tuple[GetItemsForPortfolio200Response, int], Tuple[GetItemsForPortfolio200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_portfolio(portfolio_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a portfolio

    Returns the complete portfolio record for a single portfolio. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreatePortfolio201Response, Tuple[CreatePortfolio201Response, int], Tuple[CreatePortfolio201Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_portfolios(workspace, owner, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get multiple portfolios

    Returns a list of the portfolios in compact representation that are owned by the current API user. # noqa: E501

    :param workspace: The workspace or organization to filter portfolios on.
    :type workspace: str
    :param owner: The user who owns the portfolio. Currently, API users can only get a list of portfolios that they themselves own.
    :type owner: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetPortfolios200Response, Tuple[GetPortfolios200Response, int], Tuple[GetPortfolios200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_custom_field_setting_for_portfolio(portfolio_gid, remove_custom_field_setting_for_portfolio_request, opt_pretty=None):  # noqa: E501
    """Remove a custom field from a portfolio

    Removes a custom field setting from a portfolio. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param remove_custom_field_setting_for_portfolio_request: Information about the custom field setting being removed.
    :type remove_custom_field_setting_for_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_custom_field_setting_for_portfolio_request = RemoveCustomFieldSettingForPortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def remove_item_for_portfolio(portfolio_gid, remove_item_for_portfolio_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Remove a portfolio item

    Remove an item from a portfolio. Returns an empty data block. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param remove_item_for_portfolio_request: Information about the item being removed.
    :type remove_item_for_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_item_for_portfolio_request = RemoveItemForPortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def remove_members_for_portfolio(portfolio_gid, remove_members_for_portfolio_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Remove users from a portfolio

    Removes the specified list of users from members of the portfolio. Returns the updated portfolio record. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param remove_members_for_portfolio_request: Information about the members being removed.
    :type remove_members_for_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreatePortfolio201Response, Tuple[CreatePortfolio201Response, int], Tuple[CreatePortfolio201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_members_for_portfolio_request = RemoveMembersForPortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_portfolio(portfolio_gid, create_portfolio_request, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Update a portfolio

    An existing portfolio can be updated by making a PUT request on the URL for that portfolio. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated portfolio record. # noqa: E501

    :param portfolio_gid: Globally unique identifier for the portfolio.
    :type portfolio_gid: str
    :param create_portfolio_request: The updated fields for the portfolio.
    :type create_portfolio_request: dict | bytes
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreatePortfolio201Response, Tuple[CreatePortfolio201Response, int], Tuple[CreatePortfolio201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_portfolio_request = CreatePortfolioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
