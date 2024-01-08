import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.air_rest_services_metadata_get200_response import AirRestServicesMetadataGet200Response  # noqa: E501
from openapi_server import util


def air_rest_services_metadata_get(output=None, param_callback=None):  # noqa: E501
    """Clean Air Act Metadata Service

    Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints. # noqa: E501

    :param output: Output Format Flag.  Enter one of the following keywords: - JSON &#x3D; Data model formatted as Javascript Object Notation (default). - JSONP &#x3D; Data model formatted as Javascript Object Notation with Padding.   - XML &#x3D; Data model formatted as Extensible Markup Language.
    :type output: str
    :param param_callback: JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response.
    :type param_callback: str

    :rtype: Union[AirRestServicesMetadataGet200Response, Tuple[AirRestServicesMetadataGet200Response, int], Tuple[AirRestServicesMetadataGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def air_rest_services_metadata_post(output=None, param_callback=None):  # noqa: E501
    """Clean Air Act Metadata Service

    Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints. # noqa: E501

    :param output: Output Format Flag.  Enter one of the following keywords: - JSON &#x3D; Data model formatted as Javascript Object Notation (default). - JSONP &#x3D; Data model formatted as Javascript Object Notation with Padding.   - XML &#x3D; Data model formatted as Extensible Markup Language.
    :type output: str
    :param param_callback: JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response.
    :type param_callback: str

    :rtype: Union[AirRestServicesMetadataGet200Response, Tuple[AirRestServicesMetadataGet200Response, int], Tuple[AirRestServicesMetadataGet200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
