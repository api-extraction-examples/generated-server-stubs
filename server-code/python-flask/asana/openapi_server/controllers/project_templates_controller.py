import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_job200_response import GetJob200Response  # noqa: E501
from openapi_server.models.get_project_template200_response import GetProjectTemplate200Response  # noqa: E501
from openapi_server.models.get_project_templates200_response import GetProjectTemplates200Response  # noqa: E501
from openapi_server.models.instantiate_project_request import InstantiateProjectRequest  # noqa: E501
from openapi_server import util


def get_project_template(project_template_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a project template

    Returns the complete project template record for a single project template. # noqa: E501

    :param project_template_gid: Globally unique identifier for the project template.
    :type project_template_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[GetProjectTemplate200Response, Tuple[GetProjectTemplate200Response, int], Tuple[GetProjectTemplate200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_templates(opt_pretty=None, opt_fields=None, workspace=None, team=None, limit=None, offset=None):  # noqa: E501
    """Get multiple project templates

    Returns the compact project template records for all project templates in the given team or workspace. # noqa: E501

    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param workspace: The workspace to filter results on.
    :type workspace: str
    :param team: The team to filter projects on.
    :type team: str
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetProjectTemplates200Response, Tuple[GetProjectTemplates200Response, int], Tuple[GetProjectTemplates200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_templates_for_team(team_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get a team&#39;s project templates

    Returns the compact project template records for all project templates in the team. # noqa: E501

    :param team_gid: Globally unique identifier for the team.
    :type team_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetProjectTemplates200Response, Tuple[GetProjectTemplates200Response, int], Tuple[GetProjectTemplates200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def instantiate_project(project_template_gid, opt_pretty=None, opt_fields=None, instantiate_project_request=None):  # noqa: E501
    """Instantiate a project from a project template

    Creates and returns a job that will asynchronously handle the project instantiation.  To form this request, it is recommended to first make a request to [get a project template](/docs/get-a-project-template). Then, from the response, copy the &#x60;gid&#x60; from the object in the &#x60;requested_dates&#x60; array. This &#x60;gid&#x60; should be used in &#x60;requested_dates&#x60; to instantiate a project.  _Note: The body of this request will differ if your workspace is an organization. To determine if your workspace is an organization, use the [is_organization](/docs/workspace) parameter._ # noqa: E501

    :param project_template_gid: Globally unique identifier for the project template.
    :type project_template_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param instantiate_project_request: Describes the inputs used for instantiating a project, such as the resulting project&#39;s name, which team it should be created in, and values for date variables.
    :type instantiate_project_request: dict | bytes

    :rtype: Union[GetJob200Response, Tuple[GetJob200Response, int], Tuple[GetJob200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        instantiate_project_request = InstantiateProjectRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
