import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_custom_field_settings_for_portfolio200_response import GetCustomFieldSettingsForPortfolio200Response  # noqa: E501
from openapi_server import util


def get_custom_field_settings_for_portfolio(portfolio_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get a portfolio&#39;s custom fields

    Returns a list of all of the custom fields settings on a portfolio, in compact form. # noqa: E501

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

    :rtype: Union[GetCustomFieldSettingsForPortfolio200Response, Tuple[GetCustomFieldSettingsForPortfolio200Response, int], Tuple[GetCustomFieldSettingsForPortfolio200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_custom_field_settings_for_project(project_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get a project&#39;s custom fields

    Returns a list of all of the custom fields settings on a project, in compact form. Note that, as in all queries to collections which return compact representation, &#x60;opt_fields&#x60; can be used to include more data than is returned in the compact representation. See the [getting started guide on input/output options](https://developers.asana.com/docs/#input-output-options) for more information. # noqa: E501

    :param project_gid: Globally unique identifier for the project.
    :type project_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetCustomFieldSettingsForPortfolio200Response, Tuple[GetCustomFieldSettingsForPortfolio200Response, int], Tuple[GetCustomFieldSettingsForPortfolio200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
